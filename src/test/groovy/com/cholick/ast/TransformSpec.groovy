package com.cholick.ast

import spock.lang.Specification

import java.lang.reflect.Method

class TransformSpec extends Specification {

    def "test"() {
        given:
        String classString = """
import com.cholick.ast.*

@Marker
class Test { }

new Test()
"""

        when:
        def instance = new GroovyShell().evaluate(classString)
        Method added = instance.class.declaredMethods.find { it.name == 'added' }

        then:
        added
    }

}
