(ns sweetalert.core
  (:require [t4t5.sweetalert]))

(defn alert
  "Fires up a sweetAlert
  args - the arguments from: http://tristanedwards.me/sweetalert
  callback - the function that is run when alert is confirmed"
  ([args]
   (alert args nil))
  ([args callback]
   (js/sweetAlert (apply js-obj (reduce #(conj %1 (val %2) (name (key %2))) () args)) callback)))

(defn show-input-error
  "Shows input error on open alert"
  [error]
  (.showInputError js/sweetAlert error))

(defn close
  "Closes open alert"
  []
  (.close js/sweetAlert))