package com.enigmacamp.mobilelegend;

public interface HitAble {
    public void getHit(Integer damage);

    default Double getD() {
        return 102.34;
    }
}
