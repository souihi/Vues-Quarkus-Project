import axios from "axios";
const ApiUrl = 'http://localhost:8080';

export const getUser = async() =>{
    try{
        const reponse = await axios.get(`${ApiUrl}/users`)
        return reponse.data;
    }catch(error){
        console.error(error)
        throw error;
    }
};

export const postUsers = async (userData) =>{
    try {
        const reponse = await axios.post(`${ApiUrl}/users/`, userData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};
export const putUsers = async (userId,userData) =>{
    try {
        const reponse = await axios.put(`${ApiUrl}/users/${userId}`, userData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};

export const deleteUsers = async (userId) =>{
    try {
        const reponse = await axios.delete(`${ApiUrl}/users/${userId}`)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};