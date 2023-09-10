package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBeast is a Querydsl query type for Beast
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBeast extends EntityPathBase<Beast> {

    private static final long serialVersionUID = -1179371610L;

    public static final QBeast beast = new QBeast("beast");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QBeast(String variable) {
        super(Beast.class, forVariable(variable));
    }

    public QBeast(Path<? extends Beast> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBeast(PathMetadata metadata) {
        super(Beast.class, metadata);
    }

}

