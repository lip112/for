package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlant is a Querydsl query type for Plant
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlant extends EntityPathBase<Plant> {

    private static final long serialVersionUID = -1166233934L;

    public static final QPlant plant = new QPlant("plant");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QPlant(String variable) {
        super(Plant.class, forVariable(variable));
    }

    public QPlant(Path<? extends Plant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlant(PathMetadata metadata) {
        super(Plant.class, metadata);
    }

}

