# nrepl-set-print-quota-middleware

Middleware that just sets `:nrepl.middleware.print/quota` to 1024.

## Usage

Add the following to your nrepl deps:

```clojure
com.phronemophobic/nrepl-set-print-quota-middleware
{:git/sha "35653fcad1413900ce0923872803e256a826aa39"
 :git/url "https://github.com/phronmophobic/nrepl-set-print-quota-middleware"}
```

Add the following to your middleware: 

```clojure
com.phronemophobic.nrepl-set-print-quota-middleware/middleware
```

## License

Copyright © 2021 Adrian

Distributed under the Eclipse Public License version 1.0.
