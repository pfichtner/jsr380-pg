[![Build Status](https://travis-ci.org/pfichtner/jsr380-pg.svg?branch=master)](https://travis-ci.org/pfichtner/jsr380-pg)

# jsr380-pg

Playground for JSR-380 API and implementation in conjunction with a [bytebuddy](https://bytebuddy.net/) created java agent

com.github.pfichtner.bytebuddy.pg._1_manual
-------------------------------------------
Validation code explicitly called in factory method create

com.github.pfichtner.bytebuddy._2_own_anno_with_agent
-----------------------------------------------------
Validation code automatically called within code added by javaagent if class is annotated by ``@Validate``

com.github.pfichtner.bytebuddy._3_no_anno_with_agent
----------------------------------------------------
Validation code automatically called within code added by javaagent if there are fields annotated with an annotation in package ``javax.validation.constraints``

com.github.pfichtner.bytebuddy.pg._4_no_anno_apt
----------------------------------------------------
Validation code automatically called within code added by [byte-buddy-maven-plugin](https://github.com/raphw/byte-buddy/tree/master/byte-buddy-maven-plugin) if there are fields annotated with an annotation in package ``javax.validation.constraints``
