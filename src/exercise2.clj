(ns exercise2)

(defn is-greater-than-five [x] 
	(> x 5))

(defn only-greater-than-five [numbers] 
	(filter is-greater-than-five numbers ))