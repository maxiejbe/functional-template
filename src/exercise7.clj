(ns exercise7)

(defmulti fmap (fn [f thing] (type thing)))

(defmethod fmap clojure.lang.PersistentArrayMap [f thing]   
  (zipmap (keys thing) (map f (vals thing))))
          
(defmethod fmap clojure.lang.PersistentVector [f thing]         
    (map f thing))
  
(defmethod fmap clojure.lang.PersistentList [f thing]         
    (map f thing))
