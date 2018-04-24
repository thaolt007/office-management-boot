package com.om.services.mapper;

import java.util.List;

/**
 * Created by kien.lovan on 4/23/2018.
 */
public interface EntityMapper<E, D> {
    D toDto(E entity);
    E toEntity(D dto);
    List<D> toListDto(List<E> listEntity);
    List<E> toListEntity(List<D> listDto);
}
