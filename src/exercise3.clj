(ns exercise3)

(defn fibonacci [x] (
	if (<= x 1) 
			x 
			(+ (fibonacci (- x 1)) (fibonacci (- x 2)))))
