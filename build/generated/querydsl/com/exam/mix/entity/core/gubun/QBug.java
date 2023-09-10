package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBug is a Querydsl query type for Bug
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBug extends EntityPathBase<Bug> {

    private static final long serialVersionUID = -859326341L;

    public static final QBug bug = new QBug("bug");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QBug(String variable) {
        super(Bug.class, forVariable(variable));
    }

    public QBug(Path<? extends Bug> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBug(PathMetadata metadata) {
        super(Bug.class, metadata);
    }

}

