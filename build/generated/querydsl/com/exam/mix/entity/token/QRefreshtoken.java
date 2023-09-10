package com.exam.mix.entity.token;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRefreshtoken is a Querydsl query type for Refreshtoken
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRefreshtoken extends EntityPathBase<Refreshtoken> {

    private static final long serialVersionUID = -2042576182L;

    public static final QRefreshtoken refreshtoken = new QRefreshtoken("refreshtoken");

    public final StringPath email = createString("email");

    public final StringPath refreshToken = createString("refreshToken");

    public final NumberPath<Long> rid = createNumber("rid", Long.class);

    public final EnumPath<com.exam.mix.entity.user.Role> role = createEnum("role", com.exam.mix.entity.user.Role.class);

    public QRefreshtoken(String variable) {
        super(Refreshtoken.class, forVariable(variable));
    }

    public QRefreshtoken(Path<? extends Refreshtoken> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRefreshtoken(PathMetadata metadata) {
        super(Refreshtoken.class, metadata);
    }

}

