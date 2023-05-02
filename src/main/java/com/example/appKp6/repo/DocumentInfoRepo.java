package com.example.appKp6.repo;

import com.example.appKp6.dto.Report;
import com.example.appKp6.entity.Document;
import com.example.appKp6.entity.DocumentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface DocumentInfoRepo extends JpaRepository<DocumentInfo,Long> {
    List<DocumentInfo> findByDocumentId(Long documentId);

    @Query("SELECT di.id, di.document, di.item, SUM(di.amount) AS amount, SUM(di.coefficient_price * di.amount) AS summ FROM DocumentInfo di WHERE di.document.type = 'расход' and di.document.status='проведен' AND di.document.date BETWEEN :startDate AND :endDate GROUP BY di.item.id")
    List<Object[]> findDocumentInfoForReports(Date startDate, Date endDate);

    @Procedure(name = "report")
    List<Object[]> report(Date startDate, Date endDate);
}
