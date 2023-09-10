package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDavil is a Querydsl query type for Davil
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDavil extends EntityPathBase<Davil> {

    private static final long serialVersionUID = -1177623869L;

    public static final QDavil davil = new QDavil("davil");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QDavil(String variable) {
        super(Davil.class, forVariable(variable));
    }

    public QDavil(Path<? extends Davil> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDavil(PathMetadata metadata) {
        super(Davil.class, metadata);
    }

}

