package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDragon is a Querydsl query type for Dragon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDragon extends EntityPathBase<Dragon> {

    private static final long serialVersionUID = -2131529044L;

    public static final QDragon dragon = new QDragon("dragon");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QDragon(String variable) {
        super(Dragon.class, forVariable(variable));
    }

    public QDragon(Path<? extends Dragon> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDragon(PathMetadata metadata) {
        super(Dragon.class, metadata);
    }

}

