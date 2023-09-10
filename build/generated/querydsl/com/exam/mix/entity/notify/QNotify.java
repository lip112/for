package com.exam.mix.entity.notify;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotify is a Querydsl query type for Notify
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotify extends EntityPathBase<Notify> {

    private static final long serialVersionUID = 522750583L;

    public static final QNotify notify = new QNotify("notify");

    public final StringPath content = createString("content");

    public final NumberPath<Long> nno = createNumber("nno", Long.class);

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public QNotify(String variable) {
        super(Notify.class, forVariable(variable));
    }

    public QNotify(Path<? extends Notify> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotify(PathMetadata metadata) {
        super(Notify.class, metadata);
    }

}

