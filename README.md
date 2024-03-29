# todomx

That's right: the [TodoMVCC Classic](http://todomvc.com), implemented with [Tag](https://github.com/kennytilton/tag) in [the Matrix](https://github.com/kennytilton/matrix).

## Overview

Just a demo. Check the heavily-commented source, and read-mes in the Tag and Matrix repos.

## Setup

````bash
git clone https://github.com/kennytilton/todomx.git
cd todomx
````

Most of the following scripts require [rlwrap](http://utopia.knoware.nl/~hlub/uck/rlwrap/) (on OS X installable via brew).

Build once in dev mode with the following script and then open `index.html` in your browser.

    ./scripts/build

To auto build your project in dev mode:

    ./scripts/watch

To start an auto-building Node REPL:

    ./scripts/repl

To get source map support in the Node REPL:

    lein npm install
    
To start a browser REPL:
    
1. Uncomment the following lines in src/todomx/core.cljs:
```clojure
;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))
```
2. Run `./scripts/brepl`
3. Browse to `http://localhost:9000` (you should see `Hello world!` in the web console)
4. (back to step 3) you should now see the REPL prompt: `cljs.user=>`
5. You may now evaluate ClojureScript statements in the browser context.
    
For more info using the browser as a REPL environment, see
[this](https://github.com/clojure/clojurescript/wiki/The-REPL-and-Evaluation-Environments#browser-as-evaluation-environment).
    
Clean project specific out:

    lein clean
     
Build a single release artifact with the following script and then open `index_release.html` in your browser.

    ./scripts/release

## License

Copyright © 2017 Kenneth "His Kennyness" Tilton

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
