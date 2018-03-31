(ns exercise6)

(defn faverage [numbers]
	(/ (reduce + numbers) (count numbers)))