import { 
    Center, 
    Box,
    Text,
    Stack,
    Flex,
    Image,
    FormControl,
    FormLabel,
    Input,
    Button,
    useToast,
    Modal,
    ModalOverlay,
    ModalContent,
    ModalCloseButton,
    ModalBody,
    useDisclosure,
    Switch,
    Divider
} from "@chakra-ui/react"
import { useState } from "react";
import InputMask from 'react-input-mask';
import axios from 'axios';
import { CheckIcon } from '@chakra-ui/icons';

import React from "react";

const Checkout = (props: any) => {
    const [cardNumber, setCardNumber] = useState<string>('');
    const [dateCardValidate, setDateCardValidate] = useState<string>('');
    const [cardSecurity, setCardSecurity] = useState<string>('');
    const [useWallet, setUseWallet] = useState<boolean>(false);
    const BASE_URL = process.env.API;
    const toast = useToast();
    const { isOpen, onOpen, onClose } = useDisclosure();
    const {id, name, imageUrl, price} = props;

    const handleBuyGame = async () => {
      if(cardNumber && cardNumber !== '' && 
         dateCardValidate && dateCardValidate !== '' &&
         cardSecurity && cardSecurity !== ''
      ) {
        try {
          const token = localStorage.getItem('token');
          const config = {
              headers: { Authorization: `Bearer ${token}` }
          };
          if(useWallet) {
            const descount = price < props.user.wallet ? props.user.wallet - price : props.user.wallet;
            await axios.post(`${BASE_URL}/auth/wallet`, {value: -descount}, config);
          }
          await axios.post(`${BASE_URL}/games/buy/${id}`, {}, config);
          onOpen();
        } catch (err) {
          console.log(err);
          toast({
            title: 'Erro ao realizar compra',
            status: 'error',
            isClosable: true
          });
        }
        return;
      }
      toast({
        title: 'Todos os campos de pagamento devem ser preenchidos!!!',
        status: 'error',
        isClosable: true
      });
    }

    return (
        <>
            <Center py={5}>
                <Box
                    role={'group'}
                    p={6}
                    w={'full'}
                >
                <Stack
                    align={'center'}
                    spacing={{ base: 8, md: 10 }}
                    direction={{ base: 'column', md: 'row' }}>
                    <Flex
                        flex={1}
                        justify={'center'}
                        align={'center'}
                        position={'relative'}
                        w={'full'}
                        maxW={'100px'}
                        >
                        <Box
                            position={'relative'}
                            height={'100px'}
                            rounded={'2xl'}
                            boxShadow={'2xl'}
                            width={'full'}
                            overflow={'hidden'}>
                        <Image
                            alt={'Hero Image'}
                            fit={'cover'}
                            align={'center'}
                            w={'100%'}
                            h={'100%'}
                            src={`${imageUrl}`}
                        />
                        </Box>
                    </Flex>
                    <Stack flex={1} spacing={{ base: 5, md: 10 }}>
                        <Text color={'gray.700'} fontWeight={'700'} fontSize={'1.2rem'}>
                            {name}
                        </Text>
                        <Text mt={'5px !important'} fontSize={'2rem'} color={'blue.700'} fontWeight={'600'}>
                            R$ {price}
                        </Text>
                    </Stack>
                </Stack>
                </Box>            
            </Center>
            <Box p={8}>
                  {useWallet ? 
                    (
                      <Stack
                        align={'left'}
                        spacing={{ base: 8, md: 10 }}
                        direction={{ base: 'column' }}
                        mb={10}
                      >
                        <Text mt={'5px !important'} fontSize={'1.5rem'} color={'green.500'} fontWeight={'600'}>
                          R$ {props.user.wallet}
                        </Text>
                        <Divider mt={'5px !important'} />
                        <Text mt={'5px !important'} fontSize={'1.5rem'} color={'red.500'} fontWeight={'600'}>
                          R$ {price - props.user.wallet >= 0 ? price - props.user.wallet : 0 }
                        </Text>
                      </Stack>
                    ) : null
                  }
                <Stack spacing={4}>
                  <FormControl id="email">
                    <FormLabel>Número do cartão</FormLabel>
                    <Input 
                      type="cardNumber"
                      as={InputMask}
                      mask="****-****-****-****"
                      required
                      value={cardNumber}
                      onChange={event => setCardNumber(event.target.value)}
                    />
                  </FormControl>
                  <FormControl>
                    <FormLabel>Data de Válidade</FormLabel>
                    <Input 
                      type="cardValidate"
                      as={InputMask}
                      mask="**-**"
                      required
                      value={dateCardValidate}
                      onChange={event => setDateCardValidate(event.target.value)}
                    />
                  </FormControl>
                  <FormControl id="security">
                    <FormLabel>Código de Segurança</FormLabel>
                    <Input 
                      type="cardValidate"
                      as={InputMask}
                      mask="***"
                      required
                      value={cardSecurity}
                      onChange={event => setCardSecurity(event.target.value)}
                    />
                  </FormControl>
                  <FormControl display='flex' alignItems='center'>
                    <FormLabel htmlFor='email-alerts' mb='0'>
                      User saldo da carteira?
                    </FormLabel>
                    <Switch id='email-alerts' isChecked={useWallet} onChange={event => setUseWallet(!useWallet)}/>
                  </FormControl>
                  <Stack spacing={10} pt={20}>
                    <Button
                      bg={'blue.700'}
                      color={'white'}
                      _hover={{
                        bg: 'blue.400',
                      }}
                      onClick={handleBuyGame}
                      >
                      Comprar
                    </Button>
                  </Stack>
                </Stack>
            </Box>
            <Modal onClose={onClose} isOpen={isOpen} isCentered>
              <ModalOverlay />
              <ModalContent>
                <ModalCloseButton />
                <ModalBody>
                   <Flex
                      pt={10}
                      pb={10} 
                      flex={1}
                      justify={'center'}
                      align={'center'}
                      position={'relative'}
                      w={'full'}
                      flexDirection={'column'}
                      >
                      <CheckIcon color="green.600" w={20} h={20} />
                      <Text pt="10" fontSize="2rem" fontWeight="700" align="center">
                        Compra realizada com sucesso!
                      </Text>
                   </Flex>
                </ModalBody>
              </ModalContent>
            </Modal>
        </>
    )
}

export default Checkout;