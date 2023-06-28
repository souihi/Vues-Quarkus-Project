import axios from "axios";
const ApiUrl = 'http://localhost:8080';

export const getSpace = async() =>{
    try{
        const reponse = await axios.get(`${ApiUrl}/spaces`)
        return reponse.data;
    }catch(error){
        console.error(error)
        throw error;
    }
};

export const postSpace = async (spaceData) =>{
    try {
        const reponse = await axios.post(`${ApiUrl}/spaces/`, spaceData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};
export const putSpace = async (spaceId,spaceData) =>{
    try {
        const reponse = await axios.put(`${ApiUrl}/spaces/${spaceId}`, spaceData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};

export const deleteSpace = async (spaceId) =>{
    try {
        const reponse = await axios.delete(`${ApiUrl}/spaces/${spaceId}`)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};