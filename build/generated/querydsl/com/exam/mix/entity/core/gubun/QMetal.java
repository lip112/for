package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMetal is a Querydsl query type for Metal
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMetal extends EntityPathBase<Metal> {

    private static final long serialVersionUID = -1169195186L;

    public static final QMetal metal = new QMetal("metal");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QMetal(String variable) {
        super(Metal.class, forVariable(variable));
    }

    public QMetal(Path<? extends Metal> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetal(PathMetadata metadata) {
        super(Metal.class, metadata);
    }

}

