import {
    Box,
    Center,
    useColorModeValue,
    Heading,
    Text,
    Stack,
    Image,
    Button,
    Drawer,
    useDisclosure,
    DrawerOverlay,
    DrawerContent,
    DrawerHeader,
    DrawerBody,
    Flex,
} from '@chakra-ui/react';

import { useState } from 'react';
import Checkout from './checkout';

const DEFAULT_IMAGE = '/images/shelf-default.jpg'

const StoreCardImage = (props: any) => {
    const { id, name, category, price } = props;
    const { isOpen, onOpen, onClose } = useDisclosure()
    const [placement, setPlacement] = useState<string>('right')

    return (
      <>
        <Box
            role={'group'}
            w={'full'}
            bg={useColorModeValue('white', 'gray.800')}
            boxShadow={'2xl'}
            rounded={'xl'}
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
                    >
                    <Box
                        position={'relative'}
                        height={'300px'}
                        rounded={'2xl'}
                        boxShadow={'2xl'}
                        width={'full'}
                        overflow={'hidden'}
                    >
                        <Box
                         _groupHover={{ opacity: 1 }}
                         w={'100%'}
                         h={'100%'}
                         color={'gray.100'}
                         position={'absolute'}
                         left={'0'}
                         top={'0'}
                         transition={'opacity 0.5s'}
                         opacity={'0'}
                         bg={'rgba(0,0,0,0.5)'}
                        >
                        </Box>
                        <Box
                            aria-label={'Play Button'}
                            variant={'ghost'}
                            _groupHover={{ opacity: 1 }}
                            size={'lg'}
                            color={'white'}
                            position={'absolute'}
                            left={'50%'}
                            top={'50%'}
                            transform={'translateX(-50%) translateY(-50%)'}
                            transition={'opacity 0.6s'}
                            opacity={'0'} 
                        >
                          <Stack
                            align={'center'}
                            direction={{ base: 'column'}}
                            alignContent={'center'}
                            textAlign={'center'}
                          >
                            <Text fontSize={'1.4rem'} fontWeight={700}>
                                {name}
                            </Text>
                            <Text fontSize={'0.7rem'}>
                                {category}
                            </Text>
                            <Button 
                                variant='outline'
                                onClick={onOpen}
                            >
                              Comprar
                            </Button>
                          </Stack>
                        </Box>
                        <Image
                            alt={'Hero Image'}
                            fit={'cover'}
                            align={'center'}
                            w={'100%'}
                            h={'100%'}
                            src={`${props.image}`}
                        />
                    </Box>
                </Flex>
            </Stack>
        </Box>
        <Drawer onClose={onClose} isOpen={isOpen} size={'md'}>
          <DrawerOverlay />
          <DrawerContent>
            <DrawerHeader borderBottomWidth='1px'>
               CHECKOUT
            </DrawerHeader>
            <DrawerBody>
              <Checkout
                user={props.user} 
                id={props.id} 
                name={props.name} 
                imageUrl={props.image} 
                price={props.price} 
              />
            </DrawerBody>
          </DrawerContent>
        </Drawer>
      </>
    );
}

export default StoreCardImage;