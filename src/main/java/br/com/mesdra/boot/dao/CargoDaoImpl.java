package br.com.mesdra.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.mesdra.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
