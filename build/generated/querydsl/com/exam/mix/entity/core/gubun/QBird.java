package com.exam.mix.entity.core.gubun;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBird is a Querydsl query type for Bird
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBird extends EntityPathBase<Bird> {

    private static final long serialVersionUID = -869323886L;

    public static final QBird bird = new QBird("bird");

    public final StringPath core_name = createString("core_name");

    public final StringPath main_core = createString("main_core");

    public final NumberPath<Integer> max_lv = createNumber("max_lv", Integer.class);

    public final NumberPath<Integer> min_lv = createNumber("min_lv", Integer.class);

    public final StringPath sub_core = createString("sub_core");

    public QBird(String variable) {
        super(Bird.class, forVariable(variable));
    }

    public QBird(Path<? extends Bird> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBird(PathMetadata metadata) {
        super(Bird.class, metadata);
    }

}

