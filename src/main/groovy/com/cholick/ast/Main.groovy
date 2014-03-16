package com.cholick.ast

@Marker
class Main {

    static void main(String[] args) {
        new Main().run()
    }

    def run() {
        println 'Running main'
        assert this.class.declaredMethods.find { it.name == 'added' }
    }

}
