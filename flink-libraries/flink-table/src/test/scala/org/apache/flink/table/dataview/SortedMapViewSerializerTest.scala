/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
//package org.apache.flink.table.dataview
//
//import java.lang.Long
//import java.util.Random
//
//import org.apache.flink.api.common.typeutils.base.
// {LongSerializer, SortedMapSerializer, StringSerializer}
//import org.apache.flink.api.common.typeutils.
// {BytewiseComparator, SerializerTestBase, TypeSerializer}
//import org.apache.flink.table.api.dataview.SortedMapView
//
///**
//  * A test for the [[SortedMapViewSerializer]].
//  */
//class SortedMapViewSerializerTest extends SerializerTestBase[SortedMapView[Long, String]] {
//
//  override protected def createSerializer(): TypeSerializer[SortedMapView[Long, String]] = {
//    val mapSerializer = new SortedMapSerializer[Long, String](
//      BytewiseComparator.LONG_INSTANCE,
//      LongSerializer.INSTANCE,
//      StringSerializer.INSTANCE)
//    new SortedMapViewSerializer[Long, String](mapSerializer)
//  }
//
//  override protected def getLength: Int = -1
//
//  override protected def getTypeClass: Class[SortedMapView[Long, String]] =
//    classOf[SortedMapView[Long, String]]
//
//  override protected def getTestData: Array[SortedMapView[Long, String]] = {
//    val rnd = new Random(321654)
//
//    // empty
//    val mapview1 = new SortedMapView[Long, String]()
//
//    // single element
//    val mapview2 = new SortedMapView[Long, String]()
//    mapview2.put(12345L, "12345L")
//
//    // multiple elements
//    val mapview3 = new SortedMapView[Long, String]()
//    var i = 0
//    while (i < rnd.nextInt(200)) {
//      mapview3.put(rnd.nextLong, Long.toString(rnd.nextLong))
//      i += 1
//    }
//
//    // null-value maps
//    val mapview4 = new SortedMapView[Long, String]()
//    mapview4.put(999L, null)
//
//    Array[SortedMapView[Long, String]](mapview1, mapview2, mapview3, mapview4)
//  }
//}
