package com.br.vinicanalles.aws_project02.repository;

import com.br.vinicanalles.aws_project02.model.ProductEventKey;
import com.br.vinicanalles.aws_project02.model.ProductEventLog;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan //permite que o spring escaneie as classes que existem e encontre essa daqui
public interface ProductEventLogRepository extends CrudRepository<ProductEventLog, ProductEventKey> {

    List<ProductEventLog> findAllByPk(String code);

    List<ProductEventLog> findAllByPkAndSkStartsWith(String code, String eventType);
}
