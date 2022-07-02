import {
    Heading,
    Avatar,
    Box,
    Center,
    Text,
    Stack,
    Button,
    Badge,
    useColorModeValue,
} from '@chakra-ui/react';
import { useState, useEffect } from 'react';
import axios from 'axios';

const ProfileModal = (props: any) => {
    return (
        <Center py={6}>
            <Box
                maxW={'320px'}
                w={'full'}
                bg={useColorModeValue('white', 'gray.900')}
                rounded={'lg'}
                p={6}
                textAlign={'center'}>
                <Avatar
                size={'xl'}
                src={'/images/avatar.png'}
                alt={'Avatar Alt'}
                mb={4}
                pos={'relative'}
                _after={{
                    content: '""',
                    w: 4,
                    h: 4,
                    bg: 'green.300',
                    border: '2px solid white',
                    rounded: 'full',
                    pos: 'absolute',
                    bottom: 0,
                    right: 3,
                }}
                />
                <Heading fontSize={'2xl'} fontFamily={'body'}>
                    {props.user.name}
                </Heading>
                <Text fontWeight={600} color={'gray.500'} mb={4}>
                    {props.user.email}
                </Text>
                <Stack align={'center'} justify={'center'} direction={'row'} mt={6}>
                <Badge
                    px={2}
                    py={1}
                    bg={useColorModeValue('gray.50', 'gray.800')}
                    fontWeight={'400'}>
                    #gamer
                </Badge>
                <Badge
                    px={2}
                    py={1}
                    bg={useColorModeValue('gray.50', 'gray.800')}
                    fontWeight={'400'}>
                    #gold
                </Badge>
                </Stack>

                <Text flexShrink='0' pt={5}>
                    Saldo:{' '}
                    <Text as='span'>
                        (Zone Coins){' '}
                    </Text>
                    <Text fontWeight='700' fontSize={'2xl'}>
                       {props.user?.saldo || 0} 
                    </Text>
                </Text>

                <Stack mt={8} direction={'row'} spacing={4}>
                <Button
                    flex={1}
                    fontSize={'sm'}
                    rounded={'full'}
                    _focus={{
                        bg: 'gray.200',
                    }}>
                    Alterar avatar
                </Button>
                <Button
                    flex={1}
                    fontSize={'sm'}
                    rounded={'full'}
                    bg={'blue.400'}
                    color={'white'}
                    boxShadow={
                        '0px 1px 25px -5px rgb(66 153 225 / 48%), 0 10px 10px -5px rgb(66 153 225 / 43%)'
                    }
                    _hover={{
                        bg: 'blue.700',
                    }}
                    _focus={{
                        bg: 'blue.700',
                    }}>
                    Alterar senha
                </Button>
                </Stack>
            </Box>
        </Center>
    );
}

export default ProfileModal;