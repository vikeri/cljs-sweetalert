(ns example.core
  (:require [sweetalert.core :as swal]))

(enable-console-print!)

(swal/alert {:animation true
             :showCancelButton true
             :type "input"
             :title "Twelve years?"
             :text "Twelve years - to paddle down a river? y/n"
             :closeOnConfirm false}
            #(if-not (= "n" %)
              (swal/show-input-error "Try again (n)")
              (do
                (swal/close)
                (println "Well done"))))

;(js/setTimeout #(swal/show-input-error "") 3000)
