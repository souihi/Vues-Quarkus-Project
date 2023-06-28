import axios from "axios";
const ApiUrl = 'http://localhost:8080';

export const getRole = async() =>{
    try{
        const reponse = await axios.get(`${ApiUrl}/roles`)
        return reponse.data;
    }catch(error){
        console.error(error)
        throw error;
    }
};

export const postRole = async (roleData) =>{
    try {
        const reponse = await axios.post(`${ApiUrl}/roles/`, roleData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};
export const putRole = async (roleId,roleData) =>{
    try {
        const reponse = await axios.put(`${ApiUrl}/roles/${roleId}`, roleData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};

export const deleteRole = async (roleId) =>{
    try {
        const reponse = await axios.delete(`${ApiUrl}/roles/${roleId}`)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};