/*
 * Copyright (c) 2016 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.user.ui;

import java.util.List;

import me.zhanghai.android.douya.R;
import me.zhanghai.android.douya.network.api.info.apiv2.User;

public class UserAdapter extends BaseUserAdapter {

    public UserAdapter() {}

    public UserAdapter(List<User> userList) {
        super(userList);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.user_item;
    }
}
