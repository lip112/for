package com.exam.mix.entity.core;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAllcore is a Querydsl query type for Allcore
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAllcore extends EntityPathBase<Allcore> {

    private static final long serialVersionUID = -1975029912L;

    public static final QAllcore allcore = new QAllcore("allcore");

    public final NumberPath<Long> core_id = createNumber("core_id", Long.class);

    public final StringPath core_name = createString("core_name");

    public QAllcore(String variable) {
        super(Allcore.class, forVariable(variable));
    }

    public QAllcore(Path<? extends Allcore> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAllcore(PathMetadata metadata) {
        super(Allcore.class, metadata);
    }

}

