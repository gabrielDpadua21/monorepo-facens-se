import { Flex, useToast, Image } from '@chakra-ui/react';
import type { NextPage } from 'next'
import HomeFooter from '../../components/home/footer';
import NavStore from '../../components/store/nav';
import StoreShelf from '../../components/store/shelf';
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Games } from '../../interfaces/games';
import { User } from '../../interfaces/user';

const Store: NextPage = () => {
    const [loading, setLoading] = useState<boolean>(false);
    const [gamesShelf, setGames] = useState<Games[]>([]);
    const [user, setUser] = useState<User>({id: '1', name: 'usuário', email: 'email@usuário', role: 'USER', wallet: 0});
    const BASE_URL = process.env.API;
    const toast = useToast()

    useEffect(() => {
        const fetchData = async() => {
            try {
                const token = localStorage.getItem('token');
                const config = {
                    headers: { Authorization: `Bearer ${token}` }
                };
                const games = await axios.get(`${BASE_URL}/games`, config);
                setGames(games.data.games);
                const user = await axios.get(`${BASE_URL}/auth/me`, config);
                setUser(user.data);
                setLoading(true);
            } catch(err) {  
                console.log(err);
                toast({
                    title: 'Usuário ou senha inválidos',
                    status: 'error',
                    isClosable: true
                })
            }
        }
        fetchData();
    }, [loading])

    return (
        <>
            {loading ?
             (
                 <>
                    <NavStore user={user} />
                    <StoreShelf user={user} games={gamesShelf} />
                    <HomeFooter />
                 </>
             ) : (
                 <Flex
                  minH={'100vh'}
                  align={'center'}
                  justify={'center'}
                 >
                    <Image src='/images/loading.svg' alt='loading'/>
                 </Flex>
             )}
        </>
    )
}

export default Store;