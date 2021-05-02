package com.biber.sugw.mappers.mapperExtension;

import com.biber.sugw.dao.Organization;
import com.biber.sugw.mappers.mapper.OrganizationMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrganizationMapperExtension extends OrganizationMapper {

    public List<Organization> findByName(String name);

}
