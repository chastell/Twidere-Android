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

package org.mariotaku.twidere.api.twitter.model.impl;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import org.mariotaku.twidere.api.twitter.model.TimeZone;

/**
 * Created by mariotaku on 15/5/13.
 */
@JsonObject
public class TimeZoneImpl implements TimeZone {

    @JsonField(name = "utc_offset")
    int utcOffset;
    @JsonField(name = "name")
    String name;
    @JsonField(name = "tzinfo_name")
    String tzInfoName;

    @Override
    public int getUtcOffset() {
        return utcOffset;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTzInfoName() {
        return tzInfoName;
    }
}
