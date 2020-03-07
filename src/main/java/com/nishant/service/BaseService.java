package com.nishant.service;

import java.util.List;

public interface BaseService <E,ID>{
    E create(E entity);
    E read(ID id);
    E update(E entity);
    Boolean delete(ID id);
    List<E> all();
}
