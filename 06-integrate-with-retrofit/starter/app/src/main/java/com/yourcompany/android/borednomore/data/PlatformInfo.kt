/*
 * Copyright (c) 2022 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.yourcompany.android.borednomore.data

import android.os.Build
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer

@Serializable
data class PlatformInfo(
    @SerialName("platform_name")
    val platformName: String,
    @SerialName("api_level")
    val apiLevel: Int,
    @Transient
    val isCurrent: Boolean = apiLevel == Build.VERSION.SDK_INT
)

fun main() {
/*    val lollipop = PlatformInfo("Lollipop", 21)
    //val json = Json.encodeToString(PlatformInfo.serializer(), lollipop)
    val json = Json.encodeToString(serializer<PlatformInfo>(), lollipop)
    println(json)

    val data = Json.decodeFromString(PlatformInfo.serializer(), json)
    println(data)*/

/*    val platforms: List<PlatformInfo> = listOf(
        PlatformInfo("Lollipop", 21),
        PlatformInfo("Marshmallow", 23)
    )
    val platformsSerializer = ListSerializer(PlatformInfo.serializer())
    val json = Json.encodeToString(platformsSerializer, platforms)
    println(json)*/

    val lollipop = PlatformInfo("Lollipop", 21)
    println(lollipop)

    val json = Json.encodeToString(PlatformInfo.serializer(), lollipop)
    println(json)
}