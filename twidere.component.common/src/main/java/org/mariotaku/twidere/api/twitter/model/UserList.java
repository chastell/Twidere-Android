/*
 *                 Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.api.twitter.model;

import java.util.Date;

public interface UserList extends Comparable<UserList>, TwitterResponse {
    Mode getMode();

    String getDescription();


    String getFullName();


    long getId();


    long getMemberCount();


    String getName();


    String getSlug();


    long getSubscriberCount();


    String getUri();


    User getUser();


    Date getCreatedAt();

    boolean isFollowing();

    enum Mode {
        PUBLIC("public"), PRIVATE("private");

        private final String mode;

        Mode(String mode) {
            this.mode = mode;
        }

        public static Mode parse(String str) {
            switch (str) {
                case "public":
                    return PUBLIC;
                case "private":
                    return PRIVATE;
            }
            throw new UnsupportedOperationException();
        }

        public String getMode() {
            return mode;
        }
    }
}
