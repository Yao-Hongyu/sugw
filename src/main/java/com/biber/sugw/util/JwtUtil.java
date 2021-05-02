package com.biber.sugw.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;

public class JwtUtil {

    private static final long EXPIRE_TIME = 60 * 60 * 1000;
    private static final String TOKEN_SECRET = "sugw";

    public static String sign(String username){
        Date date = new Date(System.currentTimeMillis()+EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);

        //创建头部
        HashMap<String,Object> header = new HashMap<>();
        header.put("typ","JWT");
        header.put("alg","HS256");

        return JWT.create().withHeader(header).withClaim("username",username).withIssuer("biber").withExpiresAt(date).sign(algorithm);

    }

    public static boolean verity(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        } catch (JWTVerificationException e) {
            return false;
        }
    }

    public static String decode(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            Claim username = jwt.getClaim("username");
            return username.asString();
        } catch (JWTDecodeException e){
            return null;
        }

    }


}
