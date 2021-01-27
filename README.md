# Riven
_The time for talk is over  - Riven_

[![Clojars Project](https://img.shields.io/clojars/v/workshub/riven.svg)](https://clojars.org/workshub/riven)

A tiny Clojure(Script) wrapper for the UpStamps API (upstamps.com).

Responses are currently async.

## Quick Usage

``` clojure
(require '[riven.core :as riven])

(riven/flags {:client-id       "..."
              :project-key     "..."
              :environment-key "..."}
              on-success-fn
              on-error-fn)
```

## License

Copyright © 2021 WorksHub

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
