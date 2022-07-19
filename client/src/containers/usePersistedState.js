import { useState, useEffect } from "react";

const usePersistedState = (key, initialValue) => {
    
    const lsItem = localStorage.getItem(key);
    const [value, setValue] = useState(lsItem != null ? JSON.parse(lsItem): initialValue);
    // const [value, setValue] = useState(lsItem != null ? JSON.parse(lsItem): initialValue);

    useEffect(() => {
        localStorage.setItem(key, JSON.stringify(value));
    }, [value, key])
    return [value, setValue];
}

export default usePersistedState;