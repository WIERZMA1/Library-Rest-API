package com.crud.library.domain.dao;

import com.crud.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ReaderDao extends CrudRepository<Reader, Long> {

    @Override
    Reader save(Reader reader);
}