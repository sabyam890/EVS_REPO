package com.saby.evs.repository;

import com.saby.evs.repository.IIdentityObject;

public interface IDataAccessObject<E extends IIdentityObject<?>> {

	void save(E entity);

	void delete(E entity);
	
	void find(E entity);

	void flush();
}
