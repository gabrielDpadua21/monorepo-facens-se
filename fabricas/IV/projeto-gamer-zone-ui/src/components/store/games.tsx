import { 
    SimpleGrid
} from "@chakra-ui/react"
import React from "react";
import MyPlay from './play';
import { useState, useEffect } from "react";
import axios from 'axios';
import { MyGames } from "../../interfaces/mygames";

const MyGames = () => {
    const BASE_URL = process.env.API;
    const [myGames, setMyGames] = useState<MyGames[]>([]);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const token = localStorage.getItem('token');
                const config = {
                    headers: { Authorization: `Bearer ${token}` }
                };
                const myGames = await axios.get(`${BASE_URL}/games/my`, config);
                setMyGames(myGames.data);
            } catch(err) {
                console.log(err);
            }
        }
        fetchData();
    }, [])

    return (
        <>
          <SimpleGrid columns={{base: 1}} pt={5} pb={5} px={5}>
               {myGames.map(game => {
                   return ( <MyPlay key={game.id} id={game.id} name={game.name} imageUrl={game.imageUrl} percent={game.progress} /> )
               })}
          </SimpleGrid>  
        </>
    )
}

export default MyGames;