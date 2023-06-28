import axios from "axios";
const ApiUrl = 'http://localhost:8080';

export const getBooking = async() =>{
    try{
        const reponse = await axios.get(`${ApiUrl}/bookings`)
        return reponse.data;
    }catch(error){
        console.error(error)
        throw error;
    }
};

export const postBooking = async (bookingData) =>{
    try {
        const reponse = await axios.post(`${ApiUrl}/bookings/`, bookingData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};
export const putBooking = async (bookingId,bookingData) =>{
    try {
        const reponse = await axios.put(`${ApiUrl}/bookings/${bookingId}`, bookingData)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};

export const deleteBooking = async (bookingId) =>{
    try {
        const reponse = await axios.delete(`${ApiUrl}/bookings/${bookingId}`)
        return reponse.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
};