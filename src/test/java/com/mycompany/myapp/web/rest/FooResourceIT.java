package com.mycompany.myapp.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.mycompany.myapp.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the FooResource REST controller.
 *
 * @see FooResource
 */
@IntegrationTest
class FooResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        FooResource fooResource = new FooResource();
        restMockMvc = MockMvcBuilders.standaloneSetup(fooResource).build();
    }

    /**
     * Test create
     */
    @Test
    void testCreate() throws Exception {
        restMockMvc.perform(post("/api/foo/create")).andExpect(status().isOk());
    }

    /**
     * Test get
     */
    @Test
    void testGet() throws Exception {
        restMockMvc.perform(get("/api/foo/get")).andExpect(status().isOk());
    }
}
