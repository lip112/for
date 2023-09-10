package com.exam.mix.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTimeTable is a Querydsl query type for TimeTable
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QTimeTable extends EntityPathBase<TimeTable> {

    private static final long serialVersionUID = -1348163030L;

    public static final QTimeTable timeTable = new QTimeTable("timeTable");

    public final DateTimePath<java.time.LocalDateTime> modDate = createDateTime("modDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public QTimeTable(String variable) {
        super(TimeTable.class, forVariable(variable));
    }

    public QTimeTable(Path<? extends TimeTable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTimeTable(PathMetadata metadata) {
        super(TimeTable.class, metadata);
    }

}

