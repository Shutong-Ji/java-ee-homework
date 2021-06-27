package com.swufe.javaee.beerV1;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

public class Test {
    public void test() {
        Avatar avatar = TriangleAvatar.newAvatarBuilder().build();

        avatar.create(123456L);
    }
}
