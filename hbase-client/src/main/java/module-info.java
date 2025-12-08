module org.apache.hadoop.hbase.client {
  requires audience.annotations;
  requires commons.crypto;
  requires org.apache.commons.io;
  requires org.apache.commons.lang3;
  requires hadoop.common;
  requires hbase.unsafe;
  requires java.management;
  requires java.security.sasl;
  requires jcip.annotations;
  requires org.jruby.jcodings;
  requires org.jruby.joni;
  requires metrics.core;
  requires io.opentelemetry.api;
  requires io.opentelemetry.context;
  requires org.slf4j;
  requires zookeeper;
  requires hbase.shaded.protobuf;
  requires findbugs.annotations;
  requires static com.google.errorprone.annotations;

  /*
   * XXX TODO : Problematic modules. Currently patched into hbase-client module at compile time
   * using maven --patch-module argument.
   */

  // requires com.google.gson;
  // requires com.google.common;
  // requires hbase.common;
  // requires hbase.protocol.shaded;
  // requires hbase.shaded.netty;
  // requires zookeeper.jute;

  /*
   * XXX TODO : No need to refactor Non-Conflicting Packages.
   */
  // exports org.apache.hadoop.hbase.client;
  // exports org.apache.hadoop.hbase.client.backoff;
  // exports org.apache.hadoop.hbase.client.coprocessor;
  // exports org.apache.hadoop.hbase.client.metrics;
  // exports org.apache.hadoop.hbase.client.replication;
  // exports org.apache.hadoop.hbase.client.security;
  // exports org.apache.hadoop.hbase.client.trace;
  // exports org.apache.hadoop.hbase.coprocessor;
  // exports org.apache.hadoop.hbase.ipc;
  // exports org.apache.hadoop.hbase.master;
  // exports org.apache.hadoop.hbase.protobuf;
  // exports org.apache.hadoop.hbase.quotas;
  // exports org.apache.hadoop.hbase.regionserver;
  // exports org.apache.hadoop.hbase.regionserver.wal;
  // exports org.apache.hadoop.hbase.replication;
  // exports org.apache.hadoop.hbase.shaded.protobuf;
  // exports org.apache.hadoop.hbase.slowlog;
  // exports org.apache.hadoop.hbase.snapshot;

  /*
   * XXX TODO : Needs refactoring of Conflicting packages with hbase-common.
   */
  // exports org.apache.hadoop.hbase;
  // exports org.apache.hadoop.hbase.exceptions;
  // exports org.apache.hadoop.hbase.filter;
  // exports org.apache.hadoop.hbase.security;
  // exports org.apache.hadoop.hbase.security.access;
  // exports org.apache.hadoop.hbase.security.provider;
  // exports org.apache.hadoop.hbase.security.token;
  // exports org.apache.hadoop.hbase.security.visibility;
  // exports org.apache.hadoop.hbase.util;
  // exports org.apache.hadoop.hbase.zookeeper;

  // opens org.apache.hadoop.hbase.client to com.fasterxml.jackson.databind, com.google.protobuf;
}
