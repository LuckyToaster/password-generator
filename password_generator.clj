(defn get_random_index [input_str] 
  (int (* (Math/random) (.length input_str))))

(defn get_char_from_str [string number]
  (.substring string number (+ 1 number)))

(def character_string "qwertyuiopajklzxcvbnm1234567890!@#$%^&_-")
(def password "")

(defn get_password [length] (loop [length 20] (when (> length 0) 
  (def random (get_random_index character_string))
  (def password (str password (get_char_from_str character_string random)))
    (recur (- length 1)))))

(get_password 20)
(println "password: " password)



