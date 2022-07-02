import { ReactNode } from 'react';
import {
  Box,
  Flex,
  Avatar,
  Link,
  Button,
  Menu,
  MenuButton,
  MenuList,
  MenuItem,
  MenuDivider,
  useColorModeValue,
  Stack,
  Center,
  Image,
  Text,
  useDisclosure,
  ModalOverlay,
  ModalContent,
  ModalCloseButton,
  ModalHeader,
  ModalBody,
  ModalFooter,
  Modal
} from '@chakra-ui/react';
import ProfileModal from './profile';
import MyGames from './games';
import { useRouter } from 'next/router';
import { route } from 'next/dist/server/router';

const NavLink = ({ children }: { children: ReactNode }) => (
  <Link
    px={2}
    py={1}
    rounded={'md'}
    _hover={{
      textDecoration: 'none',
      bg: useColorModeValue('gray.200', 'gray.700'),
    }}
    href={'#'}>
    {children}
  </Link>
);

const NavStore = (props: any) => {
  const router = useRouter();
  const { isOpen: profileOpen, onOpen: onOpenProfile, onClose: onCloseProfile } = useDisclosure();
  const { isOpen: gamesOpen, onOpen: onOpenGames, onClose: onCloseGames } = useDisclosure();

  const handleLogout = () => {
    localStorage.removeItem('token');
    router.push('/');
  }

  return (
    <>
      <Box bg={useColorModeValue('gray.100', 'gray.900')} px={10} pt={2} pb={2}>
        <Flex h={16} alignItems={'center'} justifyContent={'space-between'}>
          <Box>
            <Image src='/images/logo-vertical.svg' alt='logo'/>
          </Box>

          <Flex alignItems={'center'}>
            <Stack direction={'row'} spacing={7}>
            <Button
              display={{ base: 'none', 'md': 'inline-flex' }}
              fontSize={'sm'}
              fontWeight={600}
              variant={'link'}
              as={'a'}
              href={'/'}
              >
              Home
            </Button>
            <Button
              display={{ base: 'none', 'md': 'inline-flex' }}
              fontSize={'sm'}
              fontWeight={600}
              variant={'link'}
              onClick={onOpenGames}
              >
              Meus jogos
            </Button>
                  
              <Menu>
                <MenuButton
                  as={Button}
                  rounded={'full'}
                  variant={'link'}
                  cursor={'pointer'}
                  minW={0}>
                  <Avatar
                    size={'sm'}
                    src={'/images/avatar.png'}
                  />
                </MenuButton>
                <MenuList alignItems={'center'} p={10}>
                  <br />
                  <Center>
                    <Avatar
                      size={'2xl'}
                      src={'/images/avatar.png'}
                    />
                  </Center>
                  <Center mt={'20px'} mb={'20px'}>
                    <p>{props.user.name}</p>
                  </Center>
                  <Center mt={'20px'} mb={'20px'} pl={'10px'} pr={'10px'}>
                    <Box>
                        <Text align="center">
                            Saldo:
                        </Text>
                        <Text align="center">
                            (Zone Coins)
                        </Text>
                        <Text align="center" fontSize="4xl" fontWeight="700">
                            {props.user.wallet || 0}
                        </Text>
                    </Box>
                  </Center>
                  <MenuDivider />
                  <MenuItem onClick={onOpenProfile}>Atualizar dados</MenuItem>
                  <MenuItem onClick={handleLogout}>Sair</MenuItem>
                </MenuList>
              </Menu>
            </Stack>
          </Flex>
        </Flex>
      </Box>

      <Modal onClose={onCloseProfile} isOpen={profileOpen} isCentered>
        <ModalOverlay />
        <ModalContent>
          <ModalHeader>Perfil</ModalHeader>
          <ModalCloseButton />
          <ModalBody>
            <ProfileModal user={props.user} />
          </ModalBody>
        </ModalContent>
      </Modal>

      <Modal onClose={onCloseGames} isOpen={gamesOpen} isCentered size={'xl'}>
        <ModalOverlay />
        <ModalContent minW={{base: '800px'}} bg={useColorModeValue('gray.200', 'gray.800')}>
          <ModalHeader>Meus jogos</ModalHeader>
          <ModalCloseButton />
          <ModalBody>
            <MyGames />            
          </ModalBody>
        </ModalContent>
      </Modal>
    </>
  );
}

export default NavStore;