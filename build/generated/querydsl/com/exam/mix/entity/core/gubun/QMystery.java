package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMystery is a Querydsl query type for Mystery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMystery extends EntityPathBase<Mystery> {

    private static final long serialVersionUID = -2037887034L;

    public static final QMystery mystery = new QMystery("mystery");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QMystery(String variable) {
        super(Mystery.class, forVariable(variable));
    }

    public QMystery(Path<? extends Mystery> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMystery(PathMetadata metadata) {
        super(Mystery.class, metadata);
    }

}

