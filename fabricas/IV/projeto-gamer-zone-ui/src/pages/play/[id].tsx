import { Flex, Image } from '@chakra-ui/react';
import type { NextPage } from 'next'
import { useRouter } from 'next/router';
import { useEffect } from 'react';
import axios from 'axios';

const Play: NextPage = () => {
    const router = useRouter();
    const BASE_URL = process.env.API;
    const { query } = router;

    useEffect(() => {
        if(!router.isReady) return;
        const interval = setInterval(() => {
            console.log('WALLET UPDATE');
            const token = localStorage.getItem('token');
            if(token && query.id) {
                console.log('UPDATE');
                const config = {
                    headers: { Authorization: `Bearer ${token}` }
                };
                axios.post(`${BASE_URL}/auth/wallet`, {value: 1}, config);
                axios.post(`${BASE_URL}/games/percent/${query.id}`, {}, config);
            }
        }, 10000);
        interval;
     }, [[router.isReady]]);

    return (
        <>
            <Flex
            minH={'100vh'}
            align={'center'}
            justify={'center'}
            >
              <Image src='/images/loading.svg' alt='loading'/>
            </Flex>  
        </>
    )
}

export default Play;